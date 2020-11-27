package com.ivanfaathirza;

import java.util.Scanner;

/*
	NAMA = Ivan Faathirza
	KELAS = IF1
	NIM = 10119003
	Deskripsi program = program adalah program kasir cukur yang menghitung discount dan total pembayaran
    berdasarkan object dengan konsep inheritance dan memakai interface
 */

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        ServicePrice servicePrice = new ServicePrice();
        Scanner scan = new Scanner(System.in);

	    System.out.println("===Program Kasir Rock n Roll Haircut====");
        System.out.print("Customer Name : ");
        customer.setName(scan.nextLine());
        System.out.print("Customer Email : ");
        customer.setEmail(scan.nextLine());
        servicePrice.displayService();
        servicePrice.setPriceService(servicePrice.getPrice(scan.nextInt()));

        System.out.print("Are you Member (yes/no) : ");
        customer.setMember(servicePrice.checkMemberStatus(scan.next().toUpperCase()));
        System.out.println();
        System.out.println("#*******************************#");
        System.out.println("#*******CUSTOMER INVOICE********#");
        System.out.println("Date Transaction : "+customer.currentTime());
        System.out.println("Service Price : "+servicePrice.getPriceService());
        System.out.println("Discount : "+servicePrice.getSale(customer.isMember(), servicePrice.getPriceService()));
        System.out.println("Total Pay : "+servicePrice.getTotalPay(servicePrice.getPriceService(), servicePrice.getSale(customer.isMember(), servicePrice.getPriceService())));

    }
}
