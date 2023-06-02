public class Robot {

    private RobotBody body = new RobotBody();
    private RobotColor color = new RobotColor();
    private RobotMetal metal = new RobotMetal();
    
    public void createRobot(String color, String metal) {
        this.body.CreateBody();
        this.color.SetColor(color);
        this.metal.SetMetal(metal);
    } 
}
