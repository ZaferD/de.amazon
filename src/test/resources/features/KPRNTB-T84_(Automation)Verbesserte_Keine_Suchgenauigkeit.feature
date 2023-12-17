Feature: KPRNTB-136 Verbesserte Suchgenauigkeit

  @wip
  Scenario: (Automation)Verbesserte keine Suchgenauigkeit
    Given ich gehe die Webseite Amazon-Homepage amazon.de
    Then ich sehe title Amazon.de
    And ich klicke Cookies akzeptieren
    And ich gehe das Dropdown-Menü Alle neben der Suchfeld
    Then ich klicke Alle Dropdown-Menü
    When ich sehe das Dropdown-Menü die Kategorien mit dem Titel Alle enthalten
    Then ich klicke auf die Kategorie Baby im Dropdown-Menü
    And ich sehe das Dropdown-Menü zu
    Then ich sehe das Suchfeld
    And ich schreibe in das Suchfeld Schnuller
    And ich sehe in das Suchfeld ein Dropdown-Menü mit Schnuller Optionen
    Then ich klicke auf ein gesuchtes Produkt im Dropdown-Menü
    #//ein gesuchtes erst gesuchtes zweite....
    And ich sehe das Dropdown-Menü zu
    And ich sehe die Produkten unter der Ergebnisse Title auf der Seite
    And ich sehe oben links auf der Seite Seitenzahl der Seiten mehr als Ergebnissen oder Produktmenge Vorschlägen für gesuchtes Produkt
    Then ich sehe die Ergebnisse für Schnuller gesuchte Produkt unter dem Ergebnisse
    When ich schreibe in das Suchfeld Schrauben
    Then ich klicke auf die Suchschaltfläche
    And ich sehe das Dropdown-Menü Alle neben der Suchfeld
    Then ich sehe die Ergebnisse für Schrauben gesuchte Produkt unter dem Ergebnisse