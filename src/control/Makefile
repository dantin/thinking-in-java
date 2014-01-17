JAVAC=javac
JFLAGS=

bin=bin/

util-path=../../tools/

utils=\
	net/mindview/util/Print.java\
	net/mindview/util/Range.java

sources=\
	IfElse.java\
	WhileTest.java\
	ListCharacters.java\
	CommaOperator.java\
	ForEachFloat.java\
	ForEachString.java\
	ForEachInt.java\
	IfElse2.java\
	BreakAndContinue.java\
	LabeledFor.java\
	LabeledWhile.java\
	VowelsAndConsonants.java

norun=

targets := $(filter-out $(norun:.java=.class), $(sources:.java=.class))

build: init util $(sources:.java=.class)

util: $(addprefix $(util-path), $(utils:.java=.class))

%.class: %.java
	$(JAVAC) $(JFLAGS) -cp $(bin) -d $(bin) $<

.PHONY: clean test init
init:
	mkdir -p $(bin)

clean:
	-rm -rf $(bin) *.class *~

test: build
	@for target in $(basename $(targets));do java -cp $(bin) $$target;done
