#!/usr/bin/env python3

from subprocess

//print(subprocess.Popen("./gradlew -q clean build publishToMavenLocal", shell=True, stderr=subprocess.PIPE).stderr.read())

for line in subprocess.Popen("./gradlew -q clean build publishToMavenLocal", shell=True, stdout=subprocess.PIPE, stderr=subprocess.STDOUT).stderr.readlines():
    print(line)