package ict301.solid.isp;

class RobotWorker implements Workable {
    public void work() { System.out.println("Robot travaille"); }
}

class HumanWorker implements Eatable {
    public void work() { /*...*/ }
    public void eat() { /*...*/ }
}