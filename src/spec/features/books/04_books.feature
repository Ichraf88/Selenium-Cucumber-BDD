#language: en
@books @tr
Feature: Je Souhaite Tester L'affichage des books de l'application Web Demo Shop

Background:
Given Je me connecte sur le site Web Demo Shop
When Je clique sur le bouton Log in
And  Je saisis une adresse mail
And Je saisis un mot de passe
And Je clique sur le bouton Login

@books
Scenario: Je Souhaite Tester l'achat d'un book

And Je click sur Books
And Je clique sur le livre souhaité
Then les details sur livre apparaissent price "10.00"
When Je clique sur Add to car
Then  le message de validation apparait Validation message "The product has been added to your shopping cart"
When  Je clique ShoppingCarte 
And Je clique sur checkout
Then une alerte avec l'apparition du message MSG "Please accept the terms of service before the next step."
When j'accpete l'alerte
And Je coche accpter les condition
And Je clique sur checkout
And Je choisi l'adresse
And Je clique sur continue
And Je choisie la methode de livraison
And Je clique sur conditue
And Je coche cash on delivery
Then le message de validation ValidationFinal "You will pay by COD"




