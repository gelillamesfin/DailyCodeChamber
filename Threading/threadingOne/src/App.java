public class App {
    public static void main(String[] args) throws Exception {
        Task taskRunner= new Task("Thread-A");
        

        taskRunner.start();
        System.out.println("Hello, World!");
        Task taskRunner2= new Task("Thread-B");
         
        taskRunner2.start();
    }
}

class Task extends Thread {
    String name;
    public Task(String name){
        this.name=name;
    }
    public void run (){
        Thread.currentThread().setName(this.name);
        for (int i =0; i < 1000; i++){
            System.out.println("number:" + i + "-"+ Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
    }
}