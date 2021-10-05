# Komponentenbasierte Entwicklung

In diesem Repository befinden sich die Belegaufgaben für den Kurs Komponentenbasierte Entwicklung an der Hochschule für Technik und Wirtschaft Berlin.

![cat-gif](https://i.giphy.com/media/VbnUQpnihPSIgIXuZv/giphy.webp)



## Belegabgabe

Für jede Belegaufgabe erstellen sie einen Feature-Branch und committen ihren Code in ihrem eigenen Team-Repository. Danach erstellen sie eine Pull-Anfrage von dem Feature-Branch auf den Main-Branch und fügen `htwb-steven` als Reviewer hinzu. Bei manchen Belegen müssen zusätzliche Dokumentationen im Pull-Request hinzugefügt werden. Diese werden explizit genannt. Abgaben ohne Pull-Request werden **nicht** bewertet. Der Pull Request **muss** vor dem Abgabedatum erstellt werden und alle Commits **dürfen** nicht älter als das Abgabedatum sein.



## Punkte

Jeder Beleg gibt eine bestimmte Anzahl von Sternen (⭐). Jeder Stern zählt als ein Punkt. Am Ende des Semesters werden alle gesammelten Punkte aufsummiert und geben die Benotung für dieses Semester. 



## Beleg 0

**Abgabedatum:** 1 Woche

1. Finden Sie eine Person mit der sie in diesem Semester in KBE zusammenarbeiten werden. Überlegen sie sich gemeinsam einen Teamnamen (Teamnamen müssen URL sicher sein).
1. Erstellen sie ein Repository innerhalb der Organisation mit ihrem Teamnamen. Das Repository kann entweder öffentlich oder privat sein.  Stellen Sie sicher, dass jedes Mitglied Ihres Teams ausreichend Zugang hat. ⭐
1. Erstellen sie mit Git Befehlen eine exakte Kopie von diesem Repository. Verwenden sie dazu die Befehle `git clone` um das Repository herunterzuladen, `git remote` um den Remote auf das von ihnen erstellte Repository zu setzen und `git push` um die Änderungen in das neue Repository hinzuzufügen. Als Ergebnis sollten Sie ein separates Repository in der GitHub-Organisation haben, das eine Kopie dieses Repositorys ist. Außerdem haben Sie lokal zwei Remotes eingerichtet (eine für Ihr Repository und eine für dieses Vorlagen-Repository). Im Pull-Request fügen sie die Ausgabe von `git remote -v` hinzu. Hinweis: https://git-scm.com/book/de/v2/Git-Grundlagen-Mit-Remotes-arbeiten ⭐
1. Erstellen sie einen Branch. Ersetzen Sie im Branch den Inhalt dieser `README.md` durch Ihren eigenen Inhalt. Namen und Matrikelnummer müssen in der `README.md` vorhanden sein. Weitere Inhalte wie Lizensen, Code of Conduct, ... können sie freiwillig hinzufügen. Erstellen sie einen Pull-Request von ihrem Branch auf den Main-Branch ⭐
1. In diesem Semester verwenden wir Java 11 (LTS) und Apache Maven. Installieren sie beides auf ihrem PC. Als Nachweis fügen sie einen Screenshot mit folgenden Befehlen zu ihrem Pull-Request ⭐:
    - `mvn --version`
    - `java -- version`
1. (Empfehlung/Optional) In diesem Semester werden sie APIs implementieren. Um die Entwicklung der API zu vereinfachen, können sie Postman verwenden.
1. (Empfehlung/Optional) In diesem Semester werden Sie Java-Anwendungen entwickeln. Für die Entwicklung werden IDEs wie Eclipse oder Inteliji empfohlen, um die Entwicklungsprozesse zu vereinfachen und bestimmte Aspekte zu automatisieren. 
1. (Empfehlung/Optional) Die Entwicklung von Software findet in der Regel in Teams statt. Daher empfiehlt es sich, Standards zu definieren, z.B. einen Standard für die Arbeit mit Git (https://nvie.com/posts/a-successful-git-branching-model/) oder auch Commit-Standards (https://www.conventionalcommits.org/en/v1.0.0/). Diese Inhalte können in einer `CONTRIBUTING.md`-Datei festgelegt werden.
1. (Empfehlung/Optional) Die Aufgaben werden im Markdown-Format erstellt. Um sie besser lesen zu können, wird Ihnen ein Markdown-Reader/Editor wie Typora empfohlen. Zudem gibt es zahlreiche Plugins für Code-Editoren wie VSCode, Atom, etc. um Markdown Dateien anzuzeigen.

