package com.kolodzheievaZybenko.homework.lesson4;

public class Airplanes {

  public static void main(String[] args) {

    String planeType1 = "Jet";
    String planeType2 = "Airliner";
    String planeModel1 = "F-22 Raptor";
    String planeModel2 = "Aerobus 737";
    String planeModel3 = "Boeing 777";
    int seatsEcoClass1 = 120;
    int seatsEcoClass2 = 180;
    int seatsBusinessClass = 28;

    printAirplaneInfo(planeType1, planeModel1);
    printAirplaneInfo(planeType2, planeModel2, seatsEcoClass1);
    printAirplaneInfo(planeType2, planeModel3, seatsEcoClass1, seatsBusinessClass);
  }

  static void printAirplaneInfo(String name, String type) {
    System.out.println("��� �����: " + name + ", ������: " + type);
  }

  static void printAirplaneInfo(String name, String type, int ecoClass) {
    System.out.println(
        "��� �����: " + name + ", ������: " + type + ", ʳ�-�� �������� ����� �����: "
            + ecoClass);
  }

  static void printAirplaneInfo(String name, String type, int ecoClass, int businessClass) {
    System.out.println(
        "��� �����: " + name + ", ������: " + type + ", ʳ�-�� �������� ����� �����: " + ecoClass
            + ", ʳ�-�� �������� ����� �����: " + businessClass);
  }
}