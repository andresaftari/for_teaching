import matplotlib.pyplot as plt
import pandas as pd

# Load dataframe
column_names = ['Age', ' Sex ', 'Height', 'Weight', 'QRS_dur', 'PR_interval', 'QT_interval', 'T_interval', 'P_interval',
                'QRS', 'T', 'P', 'QRST', 'J', 'Heart Rate', ' 16 ', ' 17 ', ' 18 ', ' 19 ', ' 20 ', ' 21 ', ' 22 ',
                ' 23 ', ' 24 ', ' 25 ', ' 26 ', ' 27 ', ' 28 ', ' 29 ', ' 30 ', ' 31 ', ' 32 ', ' 33 ', ' 34 ', ' 35 ',
                ' 36 ', ' 37 ', ' 38 ', ' 39 ', ' 40 ', ' 41 ', ' 42 ', ' 43 ', ' 44 ', ' 45 ', ' 46 ', ' 47 ', ' 48 ',
                ' 49 ', ' 50 ', ' 51 ', ' 52 ', ' 53 ', ' 54 ', ' 55 ', ' 56 ', ' 57 ', ' 58 ', ' 59 ', ' 60 ', ' 61 ',
                ' 62 ', ' 63 ', ' 64 ', ' 65 ', ' 66 ', ' 67 ', ' 68 ', ' 69 ', ' 70 ', ' 71 ', ' 72 ', ' 73 ', ' 74 ',
                ' 75 ', ' 76 ', ' 77 ', ' 78 ', ' 79 ', ' 80 ', ' 81 ', ' 82 ', ' 83 ', ' 84 ', ' 85 ', ' 86 ', ' 87 ',
                ' 88 ', ' 89 ', ' 90 ', ' 91 ', ' 92 ', ' 93 ', ' 94 ', ' 95 ', ' 96 ', ' 97 ', ' 98 ', ' 99 ', ' 100 ',
                ' 101 ', ' 102 ', ' 103 ', ' 104 ', ' 105 ', ' 120 ', ' 106 ', ' 107 ', ' 108 ', ' 109 ', ' 110 ',
                ' 111 ', ' 112 ', ' 113 ', ' 114 ', ' 115 ', ' 116 ', ' 117 ', ' 118 ', ' 119 ', ' 121 ', ' 122 ',
                ' 123 ', ' 124 ', ' 125 ', ' 126 ', ' 127 ', ' 128 ', ' 129 ', ' 130 ', ' 131 ', ' 132 ', ' 133 ',
                ' 134 ', ' 135 ', ' 136 ', ' 137 ', ' 138 ', ' 139 ', ' 140 ', ' 141 ', ' 142 ', ' 143 ', ' 144 ',
                ' 145 ', ' 146 ', ' 147 ', ' 148 ', ' 149 ', ' 150 ', ' 151 ', ' 152 ', ' 153 ', ' 154 ', ' 155 ',
                ' 156 ', ' 157 ', ' 158 ', ' 159 ', ' 160 ', ' 161 ', ' 162 ', ' 163 ', ' 164 ', ' 165 ', ' 166 ',
                ' 167 ', ' 168 ', ' 169 ', ' 170 ', ' 171 ', ' 172 ', ' 173 ', ' 174 ', ' 175 ', ' 176 ', ' 177 ',
                ' 178 ', ' 179 ', ' 180 ', ' 181 ', ' 182 ', ' 183 ', ' 184 ', ' 185 ', ' 186 ', ' 187 ', ' 188 ',
                ' 189 ', ' 190 ', ' 191 ', ' 192 ', ' 193 ', ' 194 ', ' 195 ', ' 196 ', ' 197 ', ' 198 ', ' 199 ',
                ' 200 ', ' 201 ', ' 202 ', ' 203 ', ' 204 ', ' 205 ', ' 206 ', ' 207 ', ' 208 ', ' 209 ', ' 210 ',
                ' 211 ', ' 212 ', ' 213 ', ' 214 ', ' 215 ', ' 216 ', ' 217 ', ' 218 ', ' 219 ', ' 220 ', ' 221 ',
                ' 222 ', ' 223 ', ' 224 ', ' 225 ', ' 226 ', ' 227 ', ' 228 ', ' 229 ', ' 230 ', ' 231 ', ' 232 ',
                ' 233 ', ' 234 ', ' 235 ', ' 236 ', ' 237 ', ' 238 ', ' 239 ', ' 240 ', ' 241 ', ' 242 ', ' 243 ',
                ' 244 ', ' 245 ', ' 246 ', ' 247 ', ' 248 ', ' 249 ', ' 250 ', ' 251 ', ' 252 ', ' 253 ', ' 254 ',
                ' 255 ', ' 256 ', ' 257 ', ' 258 ', ' 259 ', ' 260 ', ' 261 ', ' 262 ', ' 263 ', ' 264 ', ' 265 ',
                ' 266 ', ' 267 ', ' 268 ', ' 269 ', ' 270 ', ' 271 ', ' 272 ', ' 273 ', ' 274 ', ' 275 ', ' 276 ',
                ' 277 ', ' 278 ', ' 279 ', ' 280 '
                ]

data = 'arrhythmia.data'
dataset = []

df = pd.read_csv(data, names=column_names)
dataset.append(df)

data_interval = df[['QRS_dur', 'PR_interval', 'QT_interval', 'QRS', 'QRST', 'Heart Rate']]

# Identification
dfcopy = pd.DataFrame(data_interval)

normal_qrs = dfcopy[(dfcopy['QRS'] >= 80) & (dfcopy['QRS'] <= 100)]
abnormal_qrs = dfcopy[dfcopy['QRS'] > 100]

# Shuffle Dataset
dTrain = df.sample(150).reset_index(drop=True)


# Dataset normalization function
def norm(all_data, column_target):
    for column in column_target:
        all_data[column] = (all_data[column].astype(int) - all_data[column].astype(int).min()) / (
                all_data[column].astype(int).max() - all_data[column].astype(int).min())

    return all_data


# Dataset standardization function
def standardization(dset, column_target):
    for column in column_target:
        dset[column] = (dset[column] - dset[column].mean()) / (dset[column].std())

    return dset


# Split Truth Table
def split_truth(d_train, column_target):
    truth_data = []

    for truth in d_train[column_target].unique():
        truth_data.append(d_train.where(d_train[column_target] == truth).dropna())

    return truth_data


# Normalization train
x = dTrain

testStartIndex = x.index.stop  # Before combine
data = pd.concat([x, df])  # Combine
data = norm(x, ['QRS_dur', 'PR_interval', 'QT_interval', 'QRS', 'Heart Rate'])

normTrain = data.iloc[:testStartIndex]

# Standardization test
x = dTrain

testStartIndex = x.index.stop # Before combine
data = pd.concat([x, df])  # Combine
data = standardization(x, ['QRS_dur', 'PR_interval', 'QT_interval', 'QRS', 'Heart Rate'])

stdTrain = data.iloc[:testStartIndex]

# Split YES or NO
for truth in dTrain['QRS'].values:
    if truth < 0:
        dTrain['y'] = 0
    else:
        dTrain['y'] = 1

print(dTrain)