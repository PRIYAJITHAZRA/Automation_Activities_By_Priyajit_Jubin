#Author: Priyajit Hazra
@Sanity
Feature: Sanity testing of GPP Application with pacs008-Collection.
I want to use this template for my feature file
Scenario: Test To Check whether  Pacs008 Collection request processed sucessfully in GPP.
Given Pacs 008 file uploaded via SOAP
When GPP receives the Pacs008 file
Then Validate the payment instruction
Scenario: Test To Check whether  Pacs008 Collection request processed sucessfully in GPP via MQ simulator
Given Pacs 008 file uploaded via MQ Simulator
When GPP receives from MQ the Pacs008 file
Then Validate the payment instruction received from MQ
