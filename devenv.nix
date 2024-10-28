{ pkgs, lib, config, inputs, ... }:

{
  packages = with pkgs; [ 
    git
    just
  ];

  languages.java = {
    enable = true;
    jdk.package = pkgs.jdk21;
    maven.enable = true;
  };

  devcontainer = {
    enable = true;
    settings = {
      customizations.vscode.extensions = [
        "mkhl.direnv"
        "jnoortheen.nix-ide"
        "vscjava.vscode-java-pack"
        "skellock.just"
      ];
    };
  };
}
