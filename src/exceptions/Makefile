JAVAC=javac
JFLAGS=

bin=bin/

util-path=../../tools/

utils=\
	net/mindview/util/Print.java

sources=\
	InheritingExceptions.java\
	FullConstructors.java\
	LoggingExceptions.java\
	LoggingExceptions2.java\
	ExtraFeatures.java\
	ExceptionMethods.java\
	WhoCalled.java\
	Rethrowing.java\
	RethrowNew.java\
	DynamicFields.java\
	NeverCaught.java\
	FinallyWorks.java\
	Switch.java\
	OnOffException1.java\
	OnOffException2.java\
	OnOffSwitch.java\
	WithFinally.java\
	AlwaysFinally.java\
	MultipleReturns.java\
	LostMessage.java\
	ExceptionSilencer.java\
	StormyInning.java\
	InputFile.java\
	Cleanup.java\
	CleanupIdiom.java\
	Human.java\
	MainException.java\
	TurnOffChecking.java

norun=\
	NeverCaught.java\
	Switch.java\
	OnOffException1.java\
	OnOffException2.java\
	InputFile.java

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
