package ru.itis.tvmain;

import ru.itis.channels.Channel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TVFunctionalImpl implements TVFunctional {

    private String fileName;

    public TVFunctionalImpl(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public int save(Channel channel) {
        try {
            OutputStream outputStream =
                    new FileOutputStream(fileName, true);
            outputStream.write((channel.toString() + "\n").getBytes());
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            return -1;
        } catch (IOException e) {
            System.err.println("Exception in IO");
            return -1;
        }
        return channel.getNumber();
    }

    @Override
    public Object shift(int number) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String currentChannelAsString = reader.readLine();
            while (currentChannelAsString != null) {
                String splitChannel[] = currentChannelAsString.split(" ");
                int channelNumber = Integer.parseInt(splitChannel[0]);
                String channelName = splitChannel[1];
                String programName = splitChannel[2];

                if (channelNumber == number) {
                    reader.close();
                    return new Channel(number, channelName, programName);
                }
                currentChannelAsString = reader.readLine();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            return null;
        } catch (IOException e) {
            System.err.println("IO exception");
            return null;
        }
        return "Channel is not exist";
    }

    @Override
    public List<Channel> move() {
        List<Channel> channelList = new ArrayList<>();

        // открыть файл
        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            String currentChannelAsString = reader.readLine();

            while (currentChannelAsString != null) {
                // разбиваем считанную строку по пробелам
                String splitChannel[] = currentChannelAsString.split(" ");
                // получаем id
                int channelNumber = Integer.parseInt(splitChannel[0]);
                // получаем имя
                String channelName = splitChannel[1];
                // получаем возраст
                String programName = splitChannel[2];
                Channel channel = new Channel(channelNumber, channelName, programName);
                channelList.add(channel);
                currentChannelAsString = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            return null;
        } catch (IOException e) {
            System.err.println("Exception in IO");
            return null;
        }
        return channelList;

    }
}
