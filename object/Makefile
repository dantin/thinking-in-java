JAVAC=javac
JFLAGS=

sources=\
	HelloDate.java\
	ShowProperties.java\
	Document1.java\
	Document2.java\
	Document3.java

norun=\
	Document1.java\
	Document2.java\
	Document3.java

targets := $(filter-out $(norun:.java=.class), $(sources:.java=.class))

build: $(sources:.java=.class)

%.class: %.java
	$(JAVAC) $(JFLAGS) $<

.PHONY: clean test
clean:
	-rm -rf *.class *~

test: build
	@for target in $(basename $(targets));do java $$target;done
