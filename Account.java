/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ourfirstbankuganda;

/**
 *
 * @author NORMZ
 */
public abstract class Account {

    protected String accountNumber;
    protected String firstName;
    protected String lastName;
    protected String branch;
    protected double openingDeposit;

    public abstract double minimumDeposit();

}
