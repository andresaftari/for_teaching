package pbo.responsi46;

public class Project {
    private int id;
    private String bulanDeadline, status;

    public void setId(int id) {
        this.id = id;
    }

    public void setBulanDeadline(String bulanDeadline) {
        this.bulanDeadline = bulanDeadline;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", bulanDeadline='" + bulanDeadline + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
