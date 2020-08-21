package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;

public class ExceptionModuleRunner {
    public static void main(String args[]) {
//        FileReader fileReader = new FileReader();
//        try {
//            fileReader.readFile();
//        } catch (FileReaderException e) {
//            System.out.println("Error: problem z odczytem pliku źródłowego.");
//        }
        //second challenge
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(1.2, 1.5);
        } catch (Exception e) {
            System.out.println("Jakiś błąd.");;
        }
    }
}
