#language: en
@books @tr
Feature: Je Souhaite Tester L'affichage des books de l'application Web Demo Shop

Background:
Given Je me connecte sur le site Web Demo Shop
When Je clique sur le bouton Log in
And  Je saisis une adresse mail
And Je saisis un mot de passe
And Je clique sur le bouton Login

@books_validScenario
Scenario: Je Souhaite Tester l'achat d'un book pour un utilisateur donné 
And Je click sur Books
And Je choisi le livre souhaité
And Je clique sur Add to cart
Then  le message de validation apparait Validation message "The product has been added to your shopping cart"
And Je clique ShoppingCarte 
And Je selectionne le paye "Canada"
And je selectionne la province "Quebec"
And Je coche "I agree with the terms of service and I adhere to them unconditionally"
And Je selectionne mon adresse
And Je coche "In store Pick up"
And Je clique sur continue
Then La page du paiement apparait Paiement "Payment method"



