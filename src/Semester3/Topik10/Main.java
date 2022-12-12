package Semester3.Topik10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static Transaksi transaksi = new Transaksi("6 November 2020");
    static Member customer, driver;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        try {
            do {
                System.out.print(
                        "\nPilihan:" +
                                "\n1. Input member" +
                                "\n2. Menampilkan info member" +
                                "\n3. Menampilkan info member berdasarkan nama" +
                                "\n4. Menampilkan info member berdasarkan saldo" +
                                "\n5. Topup saldo customer dari driver" +
                                "\n6. Pickup service customer oleh driver" +
                                "\n7. Exit aplikasi" +
                                "\nOpsi Anda : "
                );
                int option = Integer.parseInt(br.readLine());

                switch (option) {
                    case 1:
                        System.out.print("\nPilih tipe member:" +
                                "\n1. Customer" +
                                "\n2. Driver" +
                                "\nOpsi Anda : "
                        );
                        int pilihan = Integer.parseInt(br.readLine());

                        switch (pilihan) {
                            case 1:
                                System.out.print("Input nama customer : ");
                                String namaCustomer = br.readLine();
                                System.out.print("Input nik customer : ");
                                String nikCustomer = br.readLine();
                                System.out.print("Input no telp customer : ");
                                String telpCustomer = br.readLine();
                                System.out.print("Input alamat customer : ");
                                String addressCustomer = br.readLine();
                                System.out.print("Input saldo customer : ");
                                int saldoCustomer = Integer.parseInt(br.readLine());

                                customer = new Customer(nikCustomer, namaCustomer, telpCustomer, addressCustomer, saldoCustomer);
                                transaksi.addMember(customer);
                                break;

                            case 2:
                                System.out.print("\nInput nama driver : ");
                                String namaDriver = br.readLine();
                                System.out.print("Input nik driver : ");
                                String nikDriver = br.readLine();
                                System.out.print("Input no telp driver : ");
                                String telpDriver = br.readLine();
                                System.out.print("Input nomor kendaraan : ");
                                String vehicleDriver = br.readLine();
                                System.out.print("Input jenis kendaraan : ");
                                String typeDriver = br.readLine();
                                System.out.print("Input saldo driver : ");
                                int saldoDriver = Integer.parseInt(br.readLine());

                                driver = new Driver(nikDriver, namaDriver, telpDriver, vehicleDriver, typeDriver, saldoDriver);
                                transaksi.addMember(driver);
                                break;

                            default:
                                System.out.println("Tidak ada pilihan " + pilihan);
                        }
                        break;

                    case 2:
                        transaksi.displayMemberWithoutSorting();
                        break;

                    case 3:
                        transaksi.displayMembersSortByName();
                        break;

                    case 4:
                        transaksi.displayMembersSortBySaldo();
                        break;

                    case 5:
                        System.out.print("Nama customer : ");
                        String namaCustomerTopup = br.readLine();
                        System.out.print("Nama driver : ");
                        String namaDriverTopup = br.readLine();
                        System.out.print("Topup saldo sebesar : ");
                        int topup = Integer.parseInt(br.readLine());

                        transaksi.topupSaldo(namaCustomerTopup, namaDriverTopup, topup);
                        break;

                    case 6:
                        System.out.print("Nama customer : ");
                        String namaCustomer = br.readLine();
                        System.out.print("Nama driver : ");
                        String namaDriver = br.readLine();
                        System.out.print("Ongkos trip sebesar : ");
                        int ongkos = Integer.parseInt(br.readLine());

                        transaksi.pickupService(namaCustomer, namaDriver, ongkos);
                        break;

                    case 7:
                        System.exit(0);

                    default:
                        System.out.println("Tidak ada opsi " + option + "!");
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Failed to run! " + e.getMessage());
        }
    }
}