package org.prog.equalshashcode.homework;

public class GoingHome {
    public void getHome(String home){
        getHome(home,"somewhere");
    };
    public void getHome(String home, String from){
        getHome(home,from, "something");
    };
    public void getHome(String home, String from, String elevator){
        getHome(home,from,elevator,"light does not matter");
    };
    public void getHome(String home, String from, String elevator, String light){
                System.out.println("Going " + home + " from " + from + " by " + elevator + " because " + light);
    };


}
