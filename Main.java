package com.company;

public class Main {

    public static void main(String[] args) {
	Celebrity WeProject = new Celebrity();
	Celebrity SelenaGomez = new Celebrity();
	SelenaGomez.PostStories("Selena Gomez post a new stories ");
	WeProject.PostStories("WeProject post new stories");

	Subscriber sub = new Subscriber("zar2nok");
	WeProject.register(sub);
	WeProject.PostPhoto("WeProject post new photo after long time");
	WeProject.MakeLiveStream("'We didn't expect that' named live stream is going on");
	SelenaGomez.register(sub);
	SelenaGomez.PostPhoto("Selena Gomez post a new photo now");


    }
}
