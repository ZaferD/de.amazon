Feature: KPRNTB-136 Verbesserte Suchgenauigkeit

  Scenario: Verbesserte keine Suchgenauigkeit
    Given der Benutzer die Amazon-Homepage aufruft
    And   sollte der Benutzer auf der Amazon-Homepage landen
    When  der Benutzer das Dropdown-Menü neben der Suchleiste überprüft
    Then  sollte das Dropdown-Menü sichtbar und anklickbar sein
    And   das Dropdown-Menü sollte die Kategorie mit dem Titel "Alle" enthalten
    When  der Benutzer eine Auswahl aus dem Dropdown-Menü trifft
    Then  sollte sich das Dropdown-Menü schließen
    And   der Benutzer sollte zum Suchfeld weitergeleitet werden
    When  der Benutzer das Produkt in das Suchfeld eingibt
    Then  sollte unten ein Dropdown-Menü mit Optionen angezeigt werden
    And   die Optionen sollten dem Namen des gesuchten Produkts entsprechen
    And   sei der Benutzer auf der Amazon-Homepage
    Then  das Dropdown-Menü neben der Suchleiste ist sichtbar und anklickbar
    When  der Benutzer eine Auswahl aus dem Dropdown-Menü trifft
    Then  sollte sich das Dropdown-Menü schließen
    And   das System sollte die Seite aktualisieren, um zum gewünschten Produkt zu gelangen
    Then  sei der Benutzer auf der Amazon-Homepage
    And   der Benutzer hat eine Auswahl aus dem Dropdown-Menü getroffen
    When  der Benutzer das Produkt in das Suchfeld eingibt
    Then  sollte eine Liste relevanter Ergebnisse oben links angezeigt werden
    And   die Meldung "Seitenzahl" von mehr als "Produktmenge" Ergebnissen oder Vorschlägen für "gesuchte Produkt" sollte erscheinen
    Then  sei der Benutzer auf der Amazon-Homepage
    When  der Benutzer das Produkt in das Suchfeld eingibt
    Then  sollte das System verschiedene Faktoren wie Produktnamen, Verfügbarkeit und Kundenbewertungen berücksichtigen
    And   eine Liste relevanter Suchergebnisse bereitstellen
    Then  sei der Benutzer auf der Amazon-Homepage
    And   der Benutzer hat das Produkt in das Suchfeld eingegeben
    And   das gesuchte Produkt befindet sich nicht in der gewünschten Kategorie
    Then  sollte das System in allen Kategorien nach dem Produkt suchen
    And   sei der Benutzer auf der Amazon-Homepage
    When  der Benutzer eine Auswahl aus dem Dropdown-Menü trifft
    Then  sollte sich die im Dropdown-Menü ausgewählte Kategorie nicht ändern
    And   links oben den Suchergebnissen sollte die Meldung "Ergebnisse" und "Mehr über diese Ergebnisse" angezeigt werden
  Scenario: Verbesserte keine Suchgenauigkeit

    Given ich die Amazon-Homepage aufrufe,
  soll ich auf der Amazon-Homepage landen.

    When ich das Dropdown-Menü neben der Suchleiste überprüfe,
  soll das Dropdown-Menü sichtbar und anklickbar sein.

    And das Dropdown-Menü sollte die Kategorie mit dem Titel "Alle" enthalten.

    When ich eine Auswahl aus dem Dropdown-Menü treffe,
  soll sich das Dropdown-Menü schließen.

    And ich werde zum Suchfeld weitergeleitet.

    When ich das Produkt in das Suchfeld eintrage,
  soll unten ein Dropdown-Menü mit Optionen angezeigt werden.

    And die Optionen sollen dem Namen des gesuchten Produkts entsprechen.

    And ich bin auf der Amazon-Homepage.

    Then das Dropdown-Menü neben der Suchleiste ist sichtbar und anklickbar.

    When ich eine Auswahl aus dem Dropdown-Menü treffe,
  soll sich das Dropdown-Menü schließen.

    And das System wird die Seite aktualisieren, um zum gewünschten Produkt zu gelangen.

    Then ich bin auf der Amazon-Homepage.

    And ich habe eine Auswahl aus dem Dropdown-Menü getroffen.

    When ich das Produkt in das Suchfeld eintrage,
  soll eine Liste relevanter Ergebnisse oben links angezeigt werden.

    And die Meldung "Seitenzahl" von mehr als "Produktmenge" Ergebnissen oder Vorschlägen für "gesuchte Produkt" sollte erscheinen.

    Then ich bin auf der Amazon-Homepage.

    When ich das Produkt in das Suchfeld eintrage,
  soll das System verschiedene Faktoren wie Produktnamen, Verfügbarkeit und Kundenbewertungen berücksichtigen.

    And es wird eine Liste relevanter Suchergebnisse bereitstellen.

    Then ich bin auf der Amazon-Homepage.

    And ich habe das Produkt in das Suchfeld eingegeben.

    And das gesuchte Produkt befindet sich nicht in der gewünschten Kategorie.

    Then das System wird in allen Kategorien nach dem Produkt suchen.

    Then ich bin auf der Amazon-Homepage.

    When ich eine Auswahl aus dem Dropdown-Menü treffe,
  soll sich die im Dropdown-Menü ausgewählte Kategorie nicht ändern.

    And links oben den Suchergebnissen sollte die Meldung "Ergebnisse" und "Mehr über diese Ergebnisse" angezeigt werden.