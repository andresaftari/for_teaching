package pbo.responsi46;

public class Main {
    public static void main(String[] args) {
        Office office1 = new Office("SCP Foundation", "REDACTED");
        Office office2 = new Office("Global Occult Coalition", "REDACTED");

        // CREATE PROJECT 1
        Project project1 = new Project();
        project1.setId(1);
        project1.setStatus("ONHOLD");
        project1.setBulanDeadline("November 2023");

        // CREATE PROJECT 2
        Project project2 = new Project();
        project2.setId(2);
        project2.setStatus("ACTIVE");
        project2.setBulanDeadline("January 2024");

        // CREATE THE TEAM
        Team team1 = new Team("Team 1");
        team1.addDeveloper(new Developer("FE Web Developer", 5000000));
        team1.addDeveloper(new Developer("DevOps", 10000000));
        team1.addDeveloper(new Developer("Junior BE Developer", 5000000));
        team1.addDeveloper(new Developer("UI Designer", 6000000));
        team1.addAnalyst(new Analyst("System Analyst", 5000000));
        team1.addAnalyst(new Analyst("Business Analyst", 5000000));

        office1.addTeam(team1);
        office1.addProject(project1);
        office1.addProject(project2);

        // PRINT EVERYTHING
        office1.getJumlahKaryawan();
        office1.getTotalGajiKaryawan();
        System.out.println("========================================================");
        team1.setProjectStatus(1, office1.getListProject());

        System.out.println("========================================================");
        if (office1.getListActiveProject().isEmpty()) {
            System.out.println("Belum ada project yang statusnya ACTIVE!");
        } else {
            System.out.println("List project yang statusnya ACTIVE");
            for (int i = 0; i < office1.getListActiveProject().size(); i++) {
                System.out.println((i + 1) + " - " + office1.getListActiveProject().get(i));
            }
        }

//        UNCOMMENT KODE DI BAWAH UNTUK MELIHAT HASIL APABILA SEMUA TIDAK ADA ISINYA
//        Team team2 = new Team("Team 2");
//        office2.addTeam(team2);
//        office2.getJumlahKaryawan();
//        office2.getTotalGajiKaryawan();
//
//        if (office2.getListActiveProject().isEmpty()) {
//            System.out.println("Belum ada project yang statusnya ACTIVE!");
//        } else {
//            System.out.println("List project yang statusnya ACTIVE");
//            for (int i = 0; i < office2.getListActiveProject().size(); i++) {
//                System.out.println((i + 1) + " - " + office1.getListActiveProject().get(i));
//            }
//        }
//        UNCOMMENT KODE DI ATAS UNTUK MELIHAT HASIL APABILA SEMUA TIDAK ADA ISINYA

    }
}
