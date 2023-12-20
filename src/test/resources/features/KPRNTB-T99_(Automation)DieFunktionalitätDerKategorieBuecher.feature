Feature: KPRNTB-139 Erweiterung Suchkategorie


  Scenario: (Automation) Die Funktionalität der Kategorie "Bücher"
    Given ich gehe auf die Webseite Amazon-Homepage amazon.de
    Then ich sehe title Amazon.de
    And ich klicke auf Cookies akzeptieren
    Then ich sehe den Text Alle, oben links auf der Seite, unter amazon.de Logo
    And ich klicke auf den Text Alle
    Then ich sehe die Kategorienlist
    And ich sehe auf die Kategorie Bücher in der List
    Then ich klicke auf die Kategorie Bücher in der List
    And ich sehe Alle Bücher Title
    Then ich klicke auf Alle Bücher Text
    And ich sehe die Liste der Kategorien unter dem Titel Stöbern links auf der Seite
    And ich sehe Links auf der geöffneten Seite eine Liste von Bücherkategorien
    And ich sehe auf der Seite Vorgestellte Kategorien Titel
    And ich sehe die Kategorien unter Vorgestellte Kategorien Titel
    Then ich sehe, dass, wenn ich den Mauszeiger über die erste dieser Kategorien bewege, eine Liste von Kategorien angezeigt wird
    And ich klicke auf erste Kategorie
    And ich gehe zur vorherigen Seite
    Then ich sehe unten auf der Seite den Text Zurück zum Seitenanfang
    And ich klicke auf den Text Zurück zum Seitenanfang
    And ich sehe auf der Seite Bücher Title
    Then ich sehe die Sprache Text in der Liste links auf der Seite
    And ich klicke auf Deutsch Checkbox
    Then ich sehe oben links auf der Seite Seitenzahl der Seiten mehr als Ergebnissen
    And ich sehe die Ergebnisse Title auf der Seite
    Then ich sehe unter Format Text in der Liste links auf der Seite
    And ich klicke Hörbuch Checkbox
    Then ich sehe oben links auf der Seite Seitenzahl der Seiten von mehr als Ergebnissen
    And ich sehe die Ergebnisse Title auf der Seite
    Then ich sehe unter Kundenrezensionen Text in der Liste links auf der Seite
    And ich klicke vier Sterne & mehr
    Then ich sehe oben links auf der Seite Seitenzahl der Seiten von mehr als Ergebnissen
    And ich sehe die Ergebnisse Title auf der Seite
