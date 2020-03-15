package com.alex.it_workers;

public class Project {
    public static void main(String[] args) {
        ItWorker[] itWorkers = {
                new Intern("Nikolai"),
                new TeamLead("Alex"),
                new ProgramDeveloper("Ira", TypeDeveloper.MIDDLE),
                new ProgramDeveloper("Artur", TypeDeveloper.MIDDLE),
                new ProgramDeveloper("Peaty", TypeDeveloper.MIDDLE),
                new ProgramDeveloper("Dina", TypeDeveloper.JUNIOR),
                new ProgramDeveloper("Vania", TypeDeveloper.JUNIOR),
                new ProgramDeveloper("Olia", TypeDeveloper.SENIOR),
                new ManualTester("Katya"),
                new ProjectManager("Natasha")
        };
        for (ItWorker itWorker: itWorkers){
           System.out.println(itWorker.toString());
        }
        workingDay(itWorkers);
    }
    private static void workingDay(ItWorker[] itWorkers){
     for (ItWorker itWorker: itWorkers){
         itWorker.makeCoffee();
         System.out.println(itWorker.toString());
     }
    }
}
