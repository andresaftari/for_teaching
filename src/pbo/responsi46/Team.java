package pbo.responsi46;

import java.util.ArrayList;

public class Team {
    private String nama;
    private ArrayList<Developer> listDeveloper;
    private ArrayList<Analyst> listAnalyst;

    public Team(String nama) {
        this.nama = nama;
        this.listDeveloper = new ArrayList<>();
        this.listAnalyst = new ArrayList<>();
    }

    public String getNamaTeam() {
        return nama;
    }

    public void addDeveloper(Developer dev) {
        listDeveloper.add(dev);
    }

    public void addAnalyst(Analyst analyst) {
        listAnalyst.add(analyst);
    }

    public void setProjectStatus(int id, ArrayList<Project> projects) {
        if (projects.isEmpty()) {
            System.out.println("========================================================");
            System.out.println("Belum ada project!");
        } else {
            projects.forEach(it -> {
                if (it.getId() == id) {
                    it.setStatus("DONE");
                    System.out.println("Project berhasil diubah status!");
                    System.out.println(it);
                }
            });
        }
    }

    public int getTotalGajiDeveloper() {
        int total = 0;

        if (listDeveloper.isEmpty()) {
            System.out.println("========================================================");
            System.out.println("Belum ada Developer di team!");
        } else for (Developer dev : listDeveloper) total += dev.getGaji();

        return total;
    }

    public int getTotalGajiAnalyst() {
        int total = 0;

        if (listAnalyst.isEmpty()) {
            System.out.println("========================================================");
            System.out.println("Belum ada Analyst di team!");
        } else for (Analyst analyst : listAnalyst) total += analyst.getGaji();

        return total;
    }

    public ArrayList<Developer> getListDeveloper() {
        return listDeveloper;
    }

    public ArrayList<Analyst> getListAnalyst() {
        return listAnalyst;
    }
}
