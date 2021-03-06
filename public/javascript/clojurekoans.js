$(document).ready(function() {
  var nav = $('#stripe li');
  nav.find('a').click(function() {
    var li = $(this).closest('li');
    var idx = $(nav).index(li) / 2;
    var section = $('.section').eq(idx);

    $('html, body').animate({scrollTop: section.offset().top});
    return false;
  });
});

$(function() {
    $(":radio").click(function() {
        var v = this.value;
        ["ko", "en"].forEach(function(lang) {
            $("." + lang)[lang == v ? "show" : "hide"]();
        });
    });
});
