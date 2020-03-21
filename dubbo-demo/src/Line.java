public class Line {


    private String name;
    private double flow;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFlow() {
        return flow;
    }

    public void setFlow(double flow) {
        this.flow = flow;
    }

    public Line(String name, double flow) {
        this.name = name;
        this.flow = flow;
    }

    public Line() {
    }

    @Override
    public String toString() {
        return "Line{" +
                "name='" + name + '\'' +
                ", flow=" + flow +
                '}';
    }
}
