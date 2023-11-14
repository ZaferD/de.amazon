Feature: KPRNTB-136 Verbesserte Suchgenauigkeit

  Scenario: Verbesserte keine Suchgenauigkeit
#  Benutzer landet auf der Amazon-Homepage.
#  Links neben der Suchleiste sollte ein Dropdown-Menü zum Durchsuchen von Kategorien mit dem Titel „Alle“ sichtbar und anklickbar sein.
    Given Benutzer landet auf der Amazon-Homepage
    Then Anasayfada title da "Amazon" oldugu gorulur
    Then Alle Dropdown-Menü sollte sichtbar und anklickbar
    And Alle menüsüne tıklanır ve bir kategori secilir
    Then Alle menüsünün kapandığı görülür
    And

#    Der Benutzer wählt zunächst die Kategorie des Produkts aus, nach der er suchen möchte, im Kategorie-Dropdown-Menü mit dem Titel „Alle“ links neben der Suchleiste.
#  Nachdem Sie eine Auswahl aus dem Dropdown-Menü getroffen haben, sollte sich das Dropdown-Menü schließen.
#
#  Das System leitet den Benutzer zur Suchfeld weiter, um das Produkt einzugeben, nach dem er suchen möchte.
#  Wenn Sie das Produkt, nach dem Sie suchen möchten, in das Suchfeld eingeben, sollte unten ein Dropdown-Menü mit Optionen angezeigt werden, die dem Namen des gesuchten Produkts entsprechen.
