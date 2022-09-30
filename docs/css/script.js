function changeFavicon(src) {
  var link = document.createElement('link'),
    oldLink = document.getElementById('icon');
  link.id = 'dynamic-favicon';
  link.rel = 'shortcut icon';
  link.href = src;
  if (oldLink) {
    document.head.removeChild(oldLink);
  }
  document.head.appendChild(link);
}

function onButtonClick() {
  window.location.assign("https://github.com/RedReaperLp/Mod1/");
}

window.onload = function () {

}

function onButtonClickDownload() {
  window.location.assign("https://github.com/RedReaperLp/Mod1/releases/download/1.0/Mod1-1.0-Snap.jar");
}


