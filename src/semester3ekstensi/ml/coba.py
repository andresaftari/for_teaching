import pandas as pd
import numpy as np

# Load data
data = pd.read_excel('/Users/andresaftari/Development/Kuliah/Asprak/for_teaching/src/semester3ekstensi/ml/Data_Set_1301228479.xlsx', sheet_name='Data Set')
centroid_sheet = pd.read_excel('/Users/andresaftari/Development/Kuliah/Asprak/for_teaching/src/semester3ekstensi/ml/Data_Set_1301228479.xlsx', sheet_name='Centroid')

# Inisialisasi centroid secara acak
centroid1 = data.sample(1).values.flatten()[1:3]
centroid2 = data.sample(1).values.flatten()[3:5]

# Iterasi K-Means
for iteration in range(4):
    # Hitung jarak dengan Euclidean Distance
    data['Distance_C1'] = np.sqrt((data['x1 Centroid 1'] - centroid1[0])**2 + (data['x2 Centroid 1'] - centroid1[1])**2)
    data['Distance_C2'] = np.sqrt((data['x1 Centroid 2'] - centroid2[0])**2 + (data['x2 Centroid 2'] - centroid2[1])**2)
    
    # Tentukan kelompok (centroid) terdekat
    data['Cluster'] = np.where(data['Distance_C1'] < data['Distance_C2'], 1, 2)
    
    # Perbarui posisi centroid
    centroid1 = data[data['Cluster'] == 1][['x1 Centroid 1', 'x2 Centroid 1']].mean().values
    centroid2 = data[data['Cluster'] == 2][['x1 Centroid 2', 'x2 Centroid 2']].mean().values
    
    # Simpan posisi baru centroid pada sheet "Centroid"
    centroid_sheet = centroid_sheet.append(pd.DataFrame([centroid1, centroid2], columns=['x1', 'x2']), ignore_index=True)

# Simpan hasil pada sheet "Centroid"
centroid_sheet.to_excel('/Users/andresaftari/Development/Kuliah/Asprak/for_teaching/src/semester3ekstensi/ml/Data_Set_1301228479.xlsx', sheet_name='Centroid', index=False)
