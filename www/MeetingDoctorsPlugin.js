var exec = require ('cordova/exec');

exports.echo = function (message, success, error) {
  exec (success, error, 'MeetingDoctors', 'echo', [message]);
};
