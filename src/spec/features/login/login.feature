#langage: EN
@login
Feature: Je Souhaite Tester La Page Login de l'application Web Demo Shop

Scenario: Je Souhaite Tester La Page Login avec des données valides 

Given Je me connecte sur le site Web Demo Shop
When Je clique sur le bouton Log in
And  Je saisis une adresse mail
And Je saisis un mot de passe
And Je clique sur le bouton Login
Then Je me redirige vers la page home "ichrafbenmohamed@gmail.com"
