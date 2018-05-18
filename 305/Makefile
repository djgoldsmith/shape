# Makefile for Cov Thesis in Pandoc
#
# Make, Make Clean etc

#SOURCES := Frontpage.md EG-Intro.md References.md

#TARGET = Dissertation.pdf

PANDOC_OPTIONS = -f markdown+native_divs -t beamer -V theme:metropolis

#Build a PDF from the relevant sources
%.pdf: %.md
	pandoc $(PANDOC_OPTIONS) -o $@ $<

# %.html : $(SOURCES)
# 	pandoc $(SOURCES) -o $@
# #%.tex: $(SOURCES)

# #Helper method to make all will create target
# all: $(SOURCES) $(TARGET)


# .PHONY: all
