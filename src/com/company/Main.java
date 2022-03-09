package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
            throw new MyException("Custom exception");
        }

        catch (MyException e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException a) {
            System.out.println("The car ran out of gas");
        }
        catch (Throwable b) {
            System.out.println("The car is stuck");
        }
        finally {
            System.out.println("The car can be fixed");
        }
    }
}



