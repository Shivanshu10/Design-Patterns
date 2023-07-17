package com.shivanshu.Behavioral.ChainOfCommand;

public class Pannel extends Container {
        private String modelHelpText;

        public void showMessage() {
            System.out.println("Inside Pannel Tooltip");
            if (modelHelpText == null) {
                System.out.println("Pannel Tooltip is Null");
                super.showMessage();
            } else {
                System.out.println("Tooltip: "+modelHelpText);
            }
        }

        public void setModelHelpText(String helpText) {
            this.modelHelpText = helpText;
        }
}
