#!/bin/sh
curl http://0.0.0.0:8080/ > public/index.html
git checkout gh-pages
mv public/index.html .

