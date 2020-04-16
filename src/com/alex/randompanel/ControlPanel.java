package com.alex.randompanel;

public class ControlPanel {
    private static Controller[] controllers = {
            new Button(),
            new Button(),
            new Arm(),
            new Button(),
            new Button(),
            new Arm(),
            new BigRedButton(),
            new Button(),
            new Button(),
            new Arm()
    };

    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();
        controlPanel.ClickButton(controllers);
        controlPanel.PullArm(controllers);
    }

    private void ClickButton(Controller[] controllers) {
        for (Controller controller : controllers) {
            if (controller instanceof Clickable && !(controller instanceof BigRedButton)) {
                ((Clickable) controller).click();
            }
        }
    }

    private void PullArm(Controller[] controllers){
        for (Controller controller : controllers){
            if(controller instanceof Pullable){
                ((Pullable) controller).pull();
            }
        }
    }
}

