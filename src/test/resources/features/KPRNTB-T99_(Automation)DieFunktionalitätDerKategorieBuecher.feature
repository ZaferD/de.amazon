Feature: KPRNTB-139 Erweiterung Suchkategorie


  Scenario: (Automation) Die Funktionalität der Kategorie "Bücher"
    Given ich gehe die Webseite Amazon-Homepage amazon.de
    Then ich sehe title Amazon.de
    And ich klicke Cookies akzeptieren
    Then ich sehe das Alle Text neben recht der Prime Video Text
    And ich klicke das Alle Text
    Then ich sehe die Kategorienlist
    And ich sehe auf die Kategorie Bücher in der List
    Then ich klicke auf die Kategorie Bücher in der List
    And ich sehe die Bücherkategorienlist unter der Bücher
    Then ich sehe jeder Bücherkategorienlist unter der Bücher, ob klickbar sind
    And ich klicke Alle Bücher
    And ich sehe Links auf der geöffneten Seite eine Liste von Bücherkategorien
    And ich sehe auf der Seite unter Bücher Stöbern mit den Kategorien rechts daneben
    And ich sehe auf der Seite die Vorgestellte Kategorie Text
    And ich sehe die Kategorien unter Vorgestellte Kategorien Text
    Then ich sehe, wenn ich den Mauszeiger über die erste dieser Kategorien bewege, wird eine Liste von Kategorien angezeigt
    And ich sehe auf der Seite Häufig gewünsch, Bestseller, Neuheiten, Beliebte Geschenke, Beste Bewertung, Aktionen, Bis 5 EUR, die Texte
    Then ich sehe am unteren Ende der Seite gibt es die Option Zurück zum Seitenanfang
    And ich klicke den Linktext Zurück zum Seitenanfang
    And ich sehe auf der Seite unter Bücher Stöbern mit den Kategorien rechts daneben

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