@Orange
Feature: Authentication sur le site orange
  En tant que utilisateur je souhaite me connecter sur le site Orange

  Background: 
    Given Je me connecte au site Orange
    When Je saisi mon serName "Admin"
    And Je saisi mon passWord "admin123"
    And Je clique sur le bouton login

  @login
  Scenario: Authentication sur le site orange
    Then Je me redirige vers mon compte ""

  @logout
  Scenario: Authentication sur le site orange
    And Je clique sur l icone su proprietaire du compte
    And Je clique sur le bouton logout
    Then Je me redirige vers la page home ""
