(ns demo.core)

; in js:
; document.body.style.border = "5px dashed red";
; document.body.style.margin = "20px";
(set! (.-border (.-style (.-body js/document))) "5px dashed red")
(set! (.-margin (.-style (.-body js/document))) "20px")
