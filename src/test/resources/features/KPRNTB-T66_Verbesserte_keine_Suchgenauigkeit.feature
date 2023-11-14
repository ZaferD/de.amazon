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
