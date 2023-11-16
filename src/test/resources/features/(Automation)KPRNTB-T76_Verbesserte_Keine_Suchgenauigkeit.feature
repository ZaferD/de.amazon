Feature: KPRNTB-136 Verbesserte Suchgenauigkeit

  Scenario: Verbesserte keine Suchgenauigkeit
    Given Ich gehe die Webseite Amazon-Homepage amazon.de
    Then  Ich sehe title Amazon.de
    And   Ich gehe das Dropdown-Menü Alle neben der Suchfeld
    Then  Ich klicke Alle Dropdown-Menü
    When  Ich sehe das Dropdown-Menü die Kategorien mit dem Titel Alle enthalten
    Then  Ich klicke auf die Kategorie Baby im Dropdown-Menü
    And   Ich sehe das Dropdown-Menü zu
    Then  Ich sehe der Cursor im Suchfeld
    And   Ich schreibe in das Suchfeld Schnuller
    And   Ich sehe in das Suchfeld ein Dropdown-Menü mit Schnuller Optionen
    Then  Ich klicke auf ein gesuchtes Produkt im Dropdown-Menü
    And   Ich sehe das Dropdown-Menü zu
    And   Ich sehe die Produkten unter der Ergebnisse Title auf der Seite
    And   Ich sehe oben links auf der Seite Seitenzahl der Seiten mehr als Ergebnissen oder Produktmenge Vorschlägen für gesuchtes Produkt
    Then  Ich sehe unter der Ergebnisse Titel die Fotos, Verfügbarkeit, Beschreibungen und Kundenrezensionen
    When  Ich schreibe in das Suchfeld Schrauben
    Then  Ich drücke die Enter-Taste auf der Tastatur
    And   Ich sehe das Dropdown-Menü Alle neben der Suchfeld
    Then  Ich sehe unter der Ergebnisse Titel die Fotos, Verfügbarkeit, Beschreibungen und Kundenrezensionen
