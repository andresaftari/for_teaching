package Semester3.Topik13.ui;

import Semester3.Topik13.core.Food;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.util.ArrayList;

import static javax.swing.SwingConstants.CENTER;

public class FoodApp {
    private static final String[] header = {"Nama Makanan", "Rating"};
    private static String[][] foodData;
    private static final ArrayList<Food> listFood = new ArrayList<>();

    private static DefaultTableModel tableModel;

    public FoodApp() {
        setFoodData();

        tableModel = new DefaultTableModel(foodData, header);
        tableFood.setModel(tableModel);
        tableFood.setCellSelectionEnabled(true);

        TableColumnModel col = tableFood.getColumnModel();
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();

        onSelectedData();

        col.getColumn(0).setMinWidth(150);
        centerRender.setHorizontalAlignment(CENTER);
        col.getColumn(1).setCellRenderer(centerRender);

        btnAddMenu.addActionListener(actionEvent -> {
            Food food = new Food(
                    textName.getText(),
                    textType.getText(),
                    Integer.parseInt(textRating.getText()),
                    textCalories.getText()
            );

            listFood.add(food);
            tableModel.addRow(
                    new Object[]{
                            listFood.get(listFood.size() - 1).getNamaMakanan(),
                            listFood.get(listFood.size() - 1).getRating()}
            );
        });

        btnSearch.addActionListener(actionEvent -> {
            String dataToFind = textSearch.getText();

            listFood.stream().filter(it -> dataToFind.equalsIgnoreCase(it.getNamaMakanan())).forEach(it -> {
                String message = "\n==== Produk Ditemukan ====\n" +
                        "Nama : " + it.getNamaMakanan() +
                        "\nJenis : " + it.getJenis() +
                        "\nRating : " + it.getRating() +
                        "\nKalori : " + it.getKalori();

                JOptionPane.showMessageDialog(getRootPanel(), message);
            });
        });
    }

    private void onSelectedData() {
        ListSelectionModel selectionModel = tableFood.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        selectionModel.addListSelectionListener(listSelection -> {
            int selectedRow = tableFood.getSelectedRow();

            textName.setText(listFood.get(selectedRow).getNamaMakanan());
            textType.setText(listFood.get(selectedRow).getJenis());
            textRating.setText(String.valueOf(listFood.get(selectedRow).getRating()));
            textCalories.setText(listFood.get(selectedRow).getKalori());

            String message = "\n==== Produk Data ====\n" +
                    "Nama : " + listFood.get(selectedRow).getNamaMakanan() +
                    "\nJenis : " + listFood.get(selectedRow).getJenis() +
                    "\nRating : " + listFood.get(selectedRow).getRating() +
                    "\nKalori : " + listFood.get(selectedRow).getKalori();

            JOptionPane.showMessageDialog(getRootPanel(), message);
        });
    }

    private void setFoodData() {
        Food food1 = new Food(
                "Cilok",
                "Cemilan",
                2,
                "330 KKal"
        );

        Food food2 = new Food(
                "Cimol",
                "Cemilan",
                3,
                "220 KKal"
        );

        Food food3 = new Food(
                "Bebek Goreng",
                "Makanan",
                2,
                "1200 KKal"
        );

        Food food4 = new Food(
                "Ayam Goreng",
                "Makanan",
                2,
                "1200 KKal"
        );

        listFood.add(food1);
        listFood.add(food2);
        listFood.add(food3);
        listFood.add(food4);

        foodData = new String[][]{
                {food1.getNamaMakanan(), String.valueOf(food1.getRating())},
                {food2.getNamaMakanan(), String.valueOf(food2.getRating())},
                {food3.getNamaMakanan(), String.valueOf(food3.getRating())},
                {food4.getNamaMakanan(), String.valueOf(food4.getRating())}
        };
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    // Component declaration
    private JPanel rootPanel;
    private JTable tableFood;
    private JTextField textName;
    private JTextField textType;
    private JTextField textRating;
    private JTextField textCalories;
    private JTextField textSearch;
    private JButton btnSearch;
    private JButton btnAddMenu;
}