#language: en
@books @tr
Feature: Je Souhaite Tester L'affichage des books de l'application Web Demo Shop

@books_validScenario
Scenario: Je Souhaite Tester l'affichage des books

Given Je me connecte sur le site Web Demo Shop
When Je clique sur le boutton Books
Then Je vois l'affichage des cahiers dans l'application

@books_addToCart
Scenario: Je Souhaite Tester l'ajout des books sur le panier

Given Je me connecte sur le site Web Demo Shop
When Je clique sur le boutton Books
And Je vois l'affichage des cahiers dans l'application
And Je click sur le boutton add to cart
And je vois le message que le produit est ajoutee sur le panier "The product has been added to your shopping cart"

