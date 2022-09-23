Feature: Verifier le module registrer
  En tant que utilisateur je souhaite remplir le formulaire afin de m enregistrer

  @module_registre
  Scenario Outline: Remplir le formulaire register
    Given Je me connecte sur le site Mercury
    When Je clique sur le module registre
    And Je sais un data dans le champ username "<username>"
    And Je sais un data dans le champ lastname "<lastname>"

    Examples: 
      | username | lastname |
      | Ahmed    | Agoun    |
      | Honza    | Baratli  |
