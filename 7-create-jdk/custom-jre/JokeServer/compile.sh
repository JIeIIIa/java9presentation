#!/usr/bin/env bash
javac --module-source-path src -d out $(find . -name '*.java')
