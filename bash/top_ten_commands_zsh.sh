#! /usr/bin/bash
#Title:One Liner to display 10 most used commands
#Link:
#Requirements: zsh
#Tip: 
#Comment: This one-liner will read the ~/.zsh_history file and give the top ten most frequently used commands

cat ~/.zsh_history | cut -f2 -d ";" | cut -f1 -d " " | awk '{c [$1]++}END{for(j in c)print j,""c[j]""}' | sort -hr -k2 | head | column -t
