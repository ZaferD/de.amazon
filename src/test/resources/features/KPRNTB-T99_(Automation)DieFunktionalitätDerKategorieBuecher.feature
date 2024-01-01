Feature: KPRNTB-139 Erweiterung Suchkategorie

  @wip
  Scenario: (Automation) Die Funktionalität der Kategorie "Bücher"
    Given ich gehe auf die Webseite Amazon-Homepage amazon.de
    Then Ich sehe den Titel auf Amazon.de.
    And ich klicke auf Cookies akzeptieren
    Then ich sehe den Text Alle, oben links auf der Seite, unter amazon.de Logo
    And ich klicke auf den Text Alle
    Then ich sehe den Titel Alle Kategorien
    And ich sehe den Title Bücher unter dem Titel Alle Kategorien
    Then ich klicke auf den Title Bücher in der List
    And ich sehe Alle Bücher Title
    Then ich klicke auf Alle Bücher Text
    And ich sehe die Liste der Kategorien unter dem Titel Stöbern links auf der Seite
    And ich sehe auf der Seite Vorgestellte Kategorien Titel
    And ich gehe erste Kategorie unter Vorgestellte Kategorien Titel
    And ich klicke in der sich öffnenden Kategorienliste auf die erste Kategorie
    Then ich sehe die Sprache Text in der Liste links auf der Seite
    And ich klicke auf Deutsch Checkbox
    Then ich sehe oben links auf der Seite Seitenzahl der Seiten von mehr als Ergebnissen
    And ich sehe die Ergebnisse Title auf der Seite
    Then ich sehe unter Format Text in der Liste links auf der Seite
    And ich klicke Taschenbuch Checkbox
    Then ich sehe oben links auf der Seite Seitenzahl der Seiten von mehr als Ergebnissen
    And ich sehe die Ergebnisse Title auf der Seite
    Then ich sehe unter der Kundenrezensionen Text in der Liste links auf der Seite
    And ich klicke vier Sterne & mehr
    Then ich sehe oben links auf der Seite Seitenzahl der Seiten von mehr als Ergebnissen
    And ich sehe die Ergebnisse Title auf der Seite
