#! /usr/bin/python
#Title:Code Snippet to Capture Image from WebCam
#Link:http://stackoverflow.com/questions/4179220/capture-single-picture-with-opencv
#Requirements: OpenCV, python-opencv
#Tip: 

import cv
capture = cv.CaptureFromCAM(0)
img = cv.QueryFrame(capture)
cv.SaveImage("foo.png", img)
