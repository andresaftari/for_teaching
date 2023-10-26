package pbo.responsi46;

import java.util.ArrayList;

public class Office {
    private String nama, alamat;
    private ArrayList<Project> listProject;
    private ArrayList<Team> listTeam;

    public Office(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.listProject = new ArrayList<>();
        this.listTeam = new ArrayList<>();
    }

    public void addProject(Project project) {
        listProject.add(project);
    }

    public void addTeam(Team team) {
        listTeam.add(team);
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void getJumlahKaryawan() {
        int jumlah = 0;

        if (listTeam.isEmpty()) {
            System.out.println("========================================================");
            System.out.println("Belum ada team!");
        } else {
            for (Team team : listTeam) jumlah += team.getListDeveloper().size() + team.getListAnalyst().size();
            System.out.println("Jumlah karyawan PT " + nama + " adalah " + jumlah + " orang");
        }
    }

    public ArrayList<Project> getListActiveProject() {
        ArrayList<Project> listActive = new ArrayList<>();

        if (listProject.isEmpty()) {
            System.out.println("========================================================");
            System.out.println("Belum ada project!");
        } else {
            listProject.stream().filter(it -> it.getStatus().equals("ACTIVE")).forEach(listActive::add);
        }

        return listActive;
    }

    public ArrayList<Project> getListProject() {
        return listProject;
    }

    public void getTotalGajiKaryawan() {
        int total = 0;

        if (listTeam.isEmpty()) {
            System.out.println("========================================================");
            System.out.println("Belum ada team!");
        } else {
            for (Team team : listTeam) total += team.getTotalGajiDeveloper() + team.getTotalGajiAnalyst();
            System.out.println("Total gaji karyawan PT " + nama + " adalah Rp" + total);
        }
    }
}
