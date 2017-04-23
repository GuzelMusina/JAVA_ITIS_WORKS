package ru.itis;

import ru.itis.channels.Channel;
import ru.itis.tvmain.TVFunctionalImpl;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        Channel europaPlus = new Channel(33, "EuropaPlus", "TOP50");
        Channel tnt = new Channel(19, "THT", "RealBoys");
        Channel sts = new Channel(13, "CTC", "SpongeBob");

        TVFunctionalImpl tvFunctional = new TVFunctionalImpl("tv.txt");
        tvFunctional.save(europaPlus);
        tvFunctional.save(tnt);
        tvFunctional.save(sts);

        System.out.println(tvFunctional.shift(13));
        System.out.println(tvFunctional.shift(14));

        List<Channel> channels = tvFunctional.move();

        for (int i = 0; i < channels.size(); i++) {
            System.out.println(channels.get(i));
        }

    }
}
