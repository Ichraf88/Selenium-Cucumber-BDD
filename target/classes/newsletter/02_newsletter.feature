#langage: EN
@newsletter @tr
Feature: Je Souhaite Tester la souscription aux newsletter

Background:
Given Je me connecte sur le site Web Demo Shop

@newsletter_validMail
Scenario: Je Souhaite Tester la souscription aux newsletter

When Je saisis une adresse mail valide
And  clique sur Subscribe
Then le message suivant doit apparaitre Message "Thank you for signing up! A verification email has been sent. We appreciate your interest."

@newsletter_InvalidMail
Scenario: Je Souhaite Tester la souscription aux newsletter

When Je saisis une adresse mail invalide mail "ichraf.com"
And  clique sur Subscribe
Then le message suivant doit apparaitre Message1 "Enter valid email"