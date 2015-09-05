;;; Put your solutions to the assigned 4Clojure exercises here and commit
;;; back up to your fork on Github.

;;; What you enter is whatever you'd put in the "Code which fills in the blank"
;;; box in 4Clojure. You're welcome to include other things here (helper definitions,
;;; scratch computations you found helpful, etc.), SO MAKE SURE YOU LABEL YOUR
;;; "ANSWERS" clearly.

;;; I've included a few examples below just to give you a sense of what I'm looking
;;; for.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #162: Logical falsity and true

; What I pasted in the box:

1

; because all the given expressions returned 1, for example:

(= 1 (if [] 1 0))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #15: Double Down

; What I pasted in the box:

#(* 2 %)

; which is an anonymous function that doubles its argument, for example:

(= (#(* 2 %) 11) 22)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;; TO DO

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 10 - Intro To Maps

; What I put:
20
20

; considered it like stored values
; value at :b is 20 for both

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 16 - Hello World

; What I put:
(fn [name] (format "Hello, %s!" name))

; %s designates where to put name in the string

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 17 - Sequences: map

; What I put:
'(6 7 8)

; nameless function takes each number from the list and adds 5 to it

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 18 - Sequences: filter

; What I put:
'(6 7)

; filter checks numbers from list 
; if number is > 5 then its in the new list (stays in the list)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 20 - Penultimate Element

; What I put:
#(.get %(- (count %) 2))

; count = length of list
; - 2 to get second to last item

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 21 - Nth Element

;

;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem 23 - Reverse a sequence
;;; Problem 25 - Find the odd numbers
;;; Problem 37 - Regular Expressions
;;; Problem 40 - Interpose a sequence
;;; Problem 43 - Reverse interleave
;;; Problem 44 - Rotate sequence
;;; Problem 46 - Flipping out
;;; Problem 47 - Contain yourself

